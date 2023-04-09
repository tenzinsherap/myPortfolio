extends Area2D

func on_checkpoint_body_entered(body):
	if body.is_in_group("character"):
		body.set_checkpoint_pos(global_position + Vector2(0, -16))
