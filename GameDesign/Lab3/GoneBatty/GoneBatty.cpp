#include<SFML/Graphics.hpp>
#include<string>

using namespace sf;

int main(int argc, char const* argv[]) {
    //Declare variables
    int score = 0;
    float dx, dy, speed = 5;
    dx = 0;
    dy = 0;
    int changeX = 0;
    int changeY = 0;
    int changeZ = 0;
    int changeC = 0;

    //Create Window
    sf::RenderWindow window(sf::VideoMode(300, 400), "Pong SFML C++");
    window.setFramerateLimit(30);

    //create a background
    Texture textureBackground;
    textureBackground.loadFromFile("graphics/background.jpeg");
    Sprite spriteBackground;
    spriteBackground.setTexture(textureBackground);
    spriteBackground.setPosition(0, 0);


    //Create Font (display score)
    sf::Font font;
    font.loadFromFile("fonts/Hittamig.ttf");

    //Create the Label (display score)
    sf::Text text("", font);
    text.setString(std::to_string(score));
    text.setCharacterSize(30);
    //text.setStyle(sf::Text::Bold);
  //  text.setColor(sf::Color::White);

    // Create a sprite over the ball
    Texture textureBall;
    textureBall.loadFromFile("graphics/ball.png");
    Sprite spriteBall;
    spriteBall.setTexture(textureBall);
    spriteBall.setPosition(100, 100);

    // FIX Create a sprite for player 1
    /*
    Texture texturePlayer;
    texturePlayer.loadFromFile("graphics/ufo1.png");
    Sprite spritePlayer;
    spritePlayer.setTexture(texturePlayer);
    spritePlayer.setPosition(130,385);
     */


     // Create first player

    sf::RectangleShape player(sf::Vector2f(40, 10));
    player.setFillColor(sf::Color::White);
    player.setPosition(130, 385);

    // Create second player

    sf::RectangleShape player2(sf::Vector2f(40, 10));
    player2.setFillColor(sf::Color::Red);
    player2.setPosition(130, 10);


    //Game Loop
    while (window.isOpen()) {
        //Get ball and Player coordinates
        sf::Vector2f bPos = spriteBall.getPosition();
        sf::Vector2f pPos = player.getPosition();


        //Detect collisions
        if (bPos.x < 0) dx = speed;
        else if (bPos.x > 300 - 10) dx = -speed;
        if (bPos.y < 0) dy = speed;
        else if (bPos.y > 400 - 10) {
            dy = 0;
            dx = 0;
        }
        if (bPos.x >= pPos.x && bPos.x <= pPos.x + 40)
            if (bPos.y >= pPos.y - 10) {
                score++;
                text.setString(std::to_string(score));
                dy = -speed;
            }

        //Move the ball
        spriteBall.move(dx, dy);
        player.move(changeX, changeY);
        player2.move(changeZ, changeC);

        //Input detection
        if (sf::Keyboard::isKeyPressed(sf::Keyboard::Space)) {
            dx = speed;
            dy = speed;
            score = 0;
        }

        if (sf::Keyboard::isKeyPressed(sf::Keyboard::Escape)) {
            window.close();
        }
        if (sf::Keyboard::isKeyPressed(sf::Keyboard::Left))
            if (pPos.x > 0)
                player.move(-speed, 0);
        if (sf::Keyboard::isKeyPressed(sf::Keyboard::Right))
            if (pPos.x < 300 - 40)
                player.move(speed, 0);
        if (sf::Keyboard::isKeyPressed(sf::Keyboard::Up))
            changeY = -2;
        if (sf::Keyboard::isKeyPressed(sf::Keyboard::Down))
            changeY = 2;
        if (sf::Keyboard::isKeyPressed(sf::Keyboard::A))
            changeZ = -2;
        if (sf::Keyboard::isKeyPressed(sf::Keyboard::D))
            changeZ = 2;

        //Check if the window was closed
        sf::Event event;
        while (window.pollEvent(event)) {
            if (event.type == sf::Event::Closed) window.close();
        }

        //Render
        window.clear();
        window.draw(spriteBackground);
        window.draw(spriteBall);
        window.draw(player);
        window.draw(player2);
        window.draw(text);
        window.display();
    }
    return 0;
}