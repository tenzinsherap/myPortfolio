#include <iostream>
#pragma once
#include <SFML/Graphics.hpp>

using namespace sf;

class Bat {

private:
    Vector2f m_Position;

    // A Rectangle Shape Object
    RectangleShape m_Shape;
    float m_Speed = 1000.0f;

    // CHANGE TO ENUM CLASSES
    bool m_MovingRight = false;
    bool m_MovingLeft = false;
    bool m_MovingUp = false;
    bool m_MovingDown = false;

public:
    Bat(float startX, float startY);

    FloatRect getPosition();

    RectangleShape getShape();

    void moveLeft();
    void moveRight();
    void stopLeft();
    void stopRight();
    void moveUp();
    void moveDown();
    void stopUp();
    void stopDown();

    void update(Time dt);


};
