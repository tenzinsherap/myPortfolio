#include <SFML/Graphics.hpp>

#include <cassert>

int main() {
    sf::RenderWindow sfmlWin(sf::VideoMode(400, 300), "Hello World SFML Window");

    sf::Font font;

    //Passing it to font file location
    if (!font.loadFromFile("OpenSans-Bold.ttf")) {
        return -1;
    }
    sf::Text message("Hello World !", font);

    while (sfmlWin.isOpen()) {

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
