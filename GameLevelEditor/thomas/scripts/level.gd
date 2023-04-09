extends Node2D

const PORTAL_AREA: PackedScene = preload("res://scenes/env/portal.tscn")
const CHECKPOINT_AREA: PackedScene = preload("res://scenes/env/checkpoint.tscn")

export(float) var height
export(String) var next_scene_path

export(NodePath) onready var portal = get_node(portal) as Node2D
export(NodePath) onready var checkpoint = get_node(checkpoint) as Node2D

export(NodePath) onready var character_1 = get_node(character_1) as KinematicBody2D
export(NodePath) onready var character_2 = get_node(character_2) as KinematicBody2D
export(NodePath) onready var multitarget_camera = get_node(multitarget_camera) as Camera2D

func _ready() -> void:
	multitarget_camera.add_target(character_1)
	multitarget_camera.add_target(character_2)
	
	checkpoint.hide()
	
	spawn_portal()
	spawn_checkpoints()
	
	
func spawn_portal() -> void:
	var tile: TileMap = portal.get_node("Portal")
	for cell in tile.get_used_cells():
		var cp: Area2D = PORTAL_AREA.instance()
		cp.global_position = cell * tile.cell_size
		cp.scene_path = next_scene_path
		add_child(cp)
		
		
func spawn_checkpoints() -> void:
	var tile: TileMap = checkpoint.get_node("Checkpoint")
	for cell in tile.get_used_cells():
		var cp: Area2D = CHECKPOINT_AREA.instance()
		cp.global_position = cell * tile.cell_size
		add_child(cp)
		
		
func _physics_process(_delta: float) -> void:
	if character_1.global_position.y > height:
		character_1.kill()
		
	if character_2.global_position.y > height:
		character_2.kill()
