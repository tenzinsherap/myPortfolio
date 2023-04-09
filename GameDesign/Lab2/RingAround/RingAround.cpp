#include <iostream>
#include <SFML/Graphics.hpp>
#include <cassert>
#include <math.h>

using namespace sf;
const double PI = 3.14117;

struct Punto {
    double x;
    double y;
}Origen, Pi;

int spin = 0;
double radio = 300;
double angle = 90;
double matriz2[3][3] = { cos((PI / angle) * spin), sin((PI / angle) * spin),0,
                        -sin((PI / angle) * spin),cos((PI / angle) * spin),0,
                        0,0,1 };

double result[3]{ 0 };

int main() {
    RenderWindow appWindow(VideoMode(800, 600), "Bee Rotation");
    Event appEvent;


    RectangleShape rectangle;
    rectangle.setSize(Vector2f(1, 1));


    // Make texture Bee
    Texture textureBee;
    textureBee.loadFromFile("bee.png");
    Sprite spriteBee;
    spriteBee.setTexture(textureBee);

    Origen.x = 400; Origen.y = 300;
    Pi.x = radio;
    Pi.y = 0;

    double matriz1[3] = { Pi.x, Pi.y, 1 };

    while (appWindow.isOpen()) {
        while (appWindow.pollEvent(appEvent)) {
            if (appEvent.type == Event::Closed) appWindow.close();

        }
        matriz2[0][0] = cos((PI / angle) * spin);
        matriz2[0][1] = sin((PI / angle) * spin);
        matriz2[1][0] = -sin((PI / angle) * spin);
        matriz2[1][1] = cos((PI / angle) * spin);

        for (int i = 0; i < 3; i++) {
            result[0] += matriz1[i] * matriz2[i][0];
            result[1] += matriz1[i] * matriz2[i][1];
        }




        appWindow.clear(Color::Black);
        rectangle.setPosition(Origen.x, Origen.y);
        appWindow.draw(rectangle);
        appWindow.draw(spriteBee);
        spriteBee.setPosition(Origen.x + result[0], Origen.y - result[1]);
        appWindow.display();

        result[0] = 0; result[1] = 0;
        spin++;
        if (spin == 181) spin = 0;
    }
    return 0;



}