#include <SFML/Graphics.hpp>
#include <SFML/Audio.hpp>
#include<iostream>
#include<cstdlib>
#include<ctime>
#include <string>

using namespace std;
using namespace sf;

//Car border widths and location 
const double SCREEN_WIDTH = 800;
const double SCREEN_HEIGH = 600;
const int borderLeft = 140;
const int borderRight = 660;
const int racerWidth = 40;
const int racerHeight = 70;
string stringscore = "";
int score = 0;
double gameSpeed = 0.1;

//Create a video mode object 
RenderWindow window(VideoMode(SCREEN_WIDTH, SCREEN_HEIGH), "Timber Mod Car Racing");

//Creat random Number for game loop
int getRandomNumber(int a, int b);

// Create gameover screen
int gameOver();

int main()
{
    //Load game music 
    SoundBuffer gameSoundBuffer;
    gameSoundBuffer.loadFromFile("sound/game.wav");
    Sound GameSound;
    GameSound.setBuffer(gameSoundBuffer);

    //Create a texture to hold graphic on the GPU
    Texture background, racer, car1, car2, car3, car4, gameover;
   
    //Load font
    Font myfont;
    myfont.loadFromFile("fonts/Sweetly.ttf");

    //Load all images
    if (!background.loadFromFile("graphics/background.png")) return EXIT_FAILURE;
    if (!racer.loadFromFile("graphics/racer.png")) return EXIT_FAILURE;
    if (!car1.loadFromFile("graphics/car1.png")) return EXIT_FAILURE;
    if (!car2.loadFromFile("graphics/car2.png")) return EXIT_FAILURE;
    if (!car3.loadFromFile("graphics/car3.png")) return EXIT_FAILURE;
    if (!car4.loadFromFile("graphics/car4.png")) return EXIT_FAILURE;

    //Create sprite
    Sprite Background(background), Background1(background), Racer(racer), Car1(car1),
        Car2(car2), Car3(car3), Car4(car4), Gameover(gameover);

    double RacerX, RacerY, Car1X, Car1Y, Car2X, Car2Y, Car3X, Car3Y, Car4X, Car4Y;

    //Set racer and Obs pos
    RacerX = SCREEN_WIDTH / 2;
    RacerY = SCREEN_HEIGH - racerHeight;
    Car1X = getRandomNumber(borderLeft, borderRight);
    Car2X = getRandomNumber(borderLeft, borderRight);
    Car3X = getRandomNumber(borderLeft, borderRight);
    Car4X = getRandomNumber(borderLeft, borderRight);
    Car1Y = 0, Car2Y = -100, Car3Y = -200, Car4Y = -300;
    double BackgroundY1 = 0;
    double BackgroundY2 = -600;

    GameSound.play();
    GameSound.setLoop(true);

    //GAME LOOP
    while (window.isOpen())
    {
        //Init and count score
        stringscore = "SCORE:" + to_string(score);
        Text text(stringscore, myfont, 15);
        text.setPosition(5, 0);

        //Set car position
        Racer.setPosition(RacerX, RacerY);
        Car1.setPosition(Car1X, Car1Y);
        Car2.setPosition(Car2X, Car2Y);
        Car3.setPosition(Car3X, Car3Y);
        Car4.setPosition(Car4X, Car4Y);

        //Creat scrolling background
        Background.setPosition(0, BackgroundY1);
        Background1.setPosition(0, BackgroundY2);
        if (BackgroundY2 > 0)
        {
            BackgroundY1 = 0;
            BackgroundY2 = BackgroundY1 - 500;
        }
        BackgroundY1 += 0.1;
        BackgroundY2 += 0.1;

        //Set Obs LOOP
        if (Car1Y > SCREEN_HEIGH)
        {
            Car1Y = 0; Car1X = getRandomNumber(borderLeft, borderRight); score++;
        }
        else { Car1Y = Car1Y + gameSpeed; }
        if (Car2Y > SCREEN_HEIGH)
        {
            Car2Y = 0; Car2X = getRandomNumber(borderLeft, borderRight); score++;
        }
        else { Car2Y = Car2Y + gameSpeed; }
        if (Car3Y > SCREEN_HEIGH)
        {
            Car3Y = 0; Car3X = getRandomNumber(borderLeft, borderRight); score++;
        }
        else { Car3Y = Car3Y + gameSpeed; }
        if (Car4Y > SCREEN_HEIGH)
        {
            Car4Y = 0; Car4X = getRandomNumber(borderLeft, borderRight); score++;
        }
        else { Car4Y = Car4Y + gameSpeed; }

        //Game level
        if (score > 10 && score < 18) { gameSpeed = 0.4; }
        if (score > 18 && score < 25) { gameSpeed = 0.5; }
        if (score > 25 && score < 35) { gameSpeed = 0.6; }

        //Create event to handle input from keyboard
        Event event;
        while (window.pollEvent(event))
        {
            if (event.type == Event::Closed)
                window.close();
            if (event.type == sf::Event::KeyPressed)
            {
                if (event.key.code == sf::Keyboard::Left)
                {
                    if (RacerX > borderLeft) { RacerX = RacerX - 10; }
                }
                if (event.key.code == sf::Keyboard::Right)
                {
                    if (RacerX < borderRight) { RacerX = RacerX + 10; }
                }
                if (event.key.code == sf::Keyboard::Up)
                {
                    if (RacerY > 0) { RacerY = RacerY - 10; }
                }
                if (event.key.code == sf::Keyboard::Down)
                {
                    if (RacerY < SCREEN_HEIGH - 70) { RacerY = RacerY + 10; }
                }
            }
        }

        //Check if accident happen
        if (((RacerX >= (Car1X - 30)) && (RacerX <= (Car1X + 30))) && ((RacerY >= (Car1Y - 30)) && (RacerY) <= (Car1Y + 30)))
        {
            GameSound.stop(); gameOver();
        };
        if (((RacerX >= (Car2X - 30)) && (RacerX <= (Car2X + 30))) && ((RacerY >= (Car2Y - 30)) && (RacerY) <= (Car2Y + 30)))
        {
            GameSound.stop(); gameOver();
        };
        if (((RacerX >= (Car3X - 30)) && (RacerX <= (Car3X + 30))) && ((RacerY >= (Car3Y - 30)) && (RacerY) <= (Car3Y + 30)))
        {
            GameSound.stop(); gameOver();
        };
        if (((RacerX >= (Car4X - 30)) && (RacerX <= (Car4X + 30))) && ((RacerY >= (Car4Y - 30)) && (RacerY) <= (Car4Y + 30)))
        {
            GameSound.stop(); gameOver();
        };

        //Clear and redraw position
        window.clear();
        window.draw(Background);
        window.draw(Background1);
        window.draw(Racer);
        window.draw(Car1);
        window.draw(Car2);
        window.draw(Car3);
        window.draw(Car4);
        window.draw(text);
        window.display();
    }
    return EXIT_SUCCESS;
}

//Game over
int gameOver()
{
    Texture gameover, troll;
    if (!gameover.loadFromFile("graphics/over.png")) return EXIT_FAILURE;
    if (!troll.loadFromFile("graphics/troll.png")) return EXIT_FAILURE;

    Sprite Gameover(gameover);
    Sprite Troll(troll);
    Troll.setPosition(10, 350);
    SoundBuffer gameOver;
    gameOver.loadFromFile("sound/crash.wav");
    Sound GameOver;
    GameOver.setBuffer(gameOver);
    GameOver.play();
    while (window.isOpen())
    {
        Event event;
        while (window.pollEvent(event))
        {
            if (event.type == Event::Closed)
                window.close();
        }
        Font myfont;
        myfont.loadFromFile("fonts/Sweetly.ttf");
        stringscore = "YOUR SCORE:" + to_string(score);
        Text text(stringscore, myfont, 30);
        text.setPosition(210, 450);
        window.clear();
        window.draw(Gameover);
        window.draw(text);
        window.draw(Troll);
        window.display();

    }

}
int getRandomNumber(int a, int b)
{
    static bool first = true; if (first) { srand(time(NULL)); first = false; }
    int result = a + rand() % ((b + 1) - a);
    result = (result / 10) * 10;
    return result;
}