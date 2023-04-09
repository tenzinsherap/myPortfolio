extends Camera2D

onready var screen_size: Vector2 = get_viewport_rect().size

var targets: Array = []

export(float) var zoom_speed = .05
export(float) var move_speed = .5

export(float) var min_zoom = 1.5
export(float) var max_zoom = 5.0

export(Vector2) var margin = Vector2(400, 200)

func add_target(target: KinematicBody2D) -> void:
	if not target in targets:
		targets.append(target)
		
		
func _process(_delta: float) -> void:
	if not targets:
		return
		
	camera_position()
	camera_zoom()
	
	
func camera_position() -> void:
	var pos: Vector2 = Vector2.ZERO
	for target in targets:
		pos += target.position
		
	pos /= targets.size()
	position = lerp(
		position, pos, move_speed
	)
	
	
func camera_zoom() -> void:
	var rect: Rect2 = Rect2(position, Vector2.ONE)
	for target in targets:
		rect = rect.expand(target.position)
		
	rect = rect.grow_individual(margin.x, margin.y, margin.x, margin.y)
	var camera_zoom: float
	
	if rect.size.x > rect.size.y * screen_size.aspect():
		camera_zoom = clamp(
			rect.size.x / screen_size.x, min_zoom, max_zoom
		)
		
	else:
		camera_zoom = clamp(
			rect.size.y / screen_size.y, min_zoom, max_zoom
		)
		
	zoom = lerp(
		zoom, Vector2.ONE * camera_zoom, zoom_speed
	)
