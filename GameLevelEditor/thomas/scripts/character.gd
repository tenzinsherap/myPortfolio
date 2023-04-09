extends KinematicBody2D

const EXPLOSION: PackedScene = preload("res://scenes/env/explosion.tscn")

onready var sprite: Sprite = get_node("Texture")
onready var animation: AnimationPlayer = get_node("Animation")

var velocity: Vector2
var checkpoint_pos: Vector2

export(float) var move_speed
export(float) var jump_speed
export(float) var gravity_speed

export(String) var user_input

func _ready() -> void:
	checkpoint_pos = global_position + Vector2(0, -16)
	
	
func _physics_process(delta: float) -> void:
	velocity.x = Input.get_axis(
		get_negative_action(), 
		get_positive_action()
	) * move_speed
	
	velocity.y += delta * gravity_speed
	velocity = move_and_slide(velocity, Vector2.UP)
	
	if Input.is_action_just_pressed(get_jump_action()) and is_on_floor():
		velocity.y = -jump_speed
		
	animate()
	
	
func get_negative_action() -> String:
	if user_input == "arrow":
		return "ui_left"
		
	return "a"
	
	
func get_positive_action() -> String:
	if user_input == "arrow":
		return "ui_right"
		
	return "d"
	
	
func get_jump_action() -> String:
	if user_input == "arrow":
		return "ui_up"
		
	return "w"
	
	
func animate() -> void:
	set_direction()
	
	if velocity.y != 0:
		animation.play("jump")
		return
		
	if velocity.x != 0:
		animation.play("run")
		return
		
	animation.play("idle")
	
	
func set_direction() -> void:
	if velocity.x > 0:
		sprite.flip_h = false
		
	if velocity.x < 0:
		sprite.flip_h = true
		
		
func on_hitbox_body_entered(body) -> void:
	if body.is_in_group("hazard"):
		kill()
		
		
func kill() -> void:
	spawn_particles()
	global_position = checkpoint_pos
	
	
func set_checkpoint_pos(_checkpoint_pos: Vector2) -> void:
	if checkpoint_pos == _checkpoint_pos:
		return
		
	checkpoint_pos = _checkpoint_pos
	spawn_particles()
	
	
func spawn_particles() -> void:
	var explosion: Particles2D = EXPLOSION.instance()
	get_tree().root.call_deferred("add_child", explosion)
	explosion.global_position = global_position
	explosion.emitting = true
