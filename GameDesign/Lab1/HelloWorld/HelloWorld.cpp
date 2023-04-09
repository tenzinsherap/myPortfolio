#include <SFML/Graphics.hpp>
#include <cassert>

int main() {
    sf::RenderWindow sfmlWin(sf::VideoMode(400, 300), "Hello World SFML Window");
    sf::Font font;
   
    //Load the font
    if (!font.loadFromFile("Hittamig.ttf")) {
        return -1;
    }
    sf::Text message("Hello World !", font);

    //Implement clock
    sf::Clock clock;
    sf::Time frameTime{ sf::Time::Zero };

    while (sfmlWin.isOpen()) {
        frameTime = clock.restart();






        sf::Event e;
        while (sfmlWin.pollEvent(e)) {

            switch (e.type) {
            case sf::Event::EventType::Closed:
                sfmlWin.close();
                break;
            }
        }

        sfmlWin.clear();
        sfmlWin.draw(message);
        sfmlWin.display();
    }
    return 0;
}