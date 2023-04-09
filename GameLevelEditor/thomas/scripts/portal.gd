extends Area2D

var targets: Array = []

var scene_path: String

func on_portal_body_entered(body):
	if body.is_in_group("character"):
		if not body in targets:
			targets.append(body)
			body.spawn_particles()
			
	if targets.size() == 2:
		var _change_scene: bool = get_tree().change_scene(scene_path)
