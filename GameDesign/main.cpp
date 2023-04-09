#include <iostream>
#include "Bat.h"
#include <sstream>
#include <cstdlib>
#include <SFML/Graphics.hpp>

int main() {
    //Create the video mode object

    VideoMode vm;
    View view(FloatRect(0,0,1920,1080));
    RenderWindow window(vm, "Pong", Style::Fullscreen);
    window.setView(view);

    int score = 0;
    int lives = 3;

    //Create the bat at the bottom of the screen
    //Create the sprite bat

    /*
    Texture textureBat;
    textureBat.loadFromFile("snitch.png");
    Sprite spriteBat;
    spriteBat.setTexture(textureBat);
    Bat spriteBat.setPosition(1920/2,1080-2 );
    */

    Bat bat(1920/2, 1080-20);

    //Create a text object called HUD
    Text hud;
    //Font
    Font font;
    font.loadFromFile("OpenSans-Bold.ttf");

    // Set the font to our retro style
    hud.setFont(font);

    hud.setCharacterSize(75);
    hud.setFillColor(Color::White);
    hud.setPosition(20,20);

    Clock clock;

    while (window.isOpen()) {
        Event event;
        while (window.pollEvent(event))
        {
            if (event.type == Event::Closed)
                // Quit the game when the window is closed
                window.close();

        }

        // Handle the player quitting
        if (Keyboard::isKeyPressed(Keyboard::Escape))
        {
            window.close();
        }

        // Handle the pressing and releasing of the arrow keys
        if (Keyboard::isKeyPressed(Keyboard::Left))
        {
            bat.moveLeft();
        }
        else
        {
            bat.stopLeft();
        }

        if (Keyboard::isKeyPressed(Keyboard::Right))
        {
            bat.moveRight();
        }
        else
        {
            bat.stopRight();
        }
        if (Keyboard::isKeyPressed(Keyboard::PageUp)) {
            bat.moveUp();
        }
        else {
            bat.stopUp();
        }
        if (Keyboard::isKeyPressed(Keyboard::PageDown)){
            bat.moveDown();
        }
        else {
            bat.stopDown();
        }


       // Update the bat, the ball and the HUD

        // Update the delta time
        Time dt = clock.restart();
        bat.update(dt);
        // Update the HUD text
        std::stringstream ss;
        ss << "Score:" << score << "    Lives:" << lives;
        hud.setString(ss.str());

       //Draw the bat

        window.clear();
        window.draw(hud);
        window.draw(bat.getShape());
        window.display();
    }

    return 0;
}


