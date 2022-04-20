package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    private void posunSeDolu(Turtle zofka) {
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.penDown();
    }

    private void nakresliPrase(Turtle zofka) {
        zofka.setPenColor(Color.PINK);
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(45);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(135);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(135);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(135);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(45);
        zofka.move(130);
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnLeft(95);
        zofka.move(100);
        zofka.turnRight(140);
    }

    private void posunSeNahoru(Turtle zofka) {
        zofka.penUp();
        zofka.move(400);
        zofka.turnRight(90);
        zofka.move(470);
        zofka.penDown();
    }

    private void nakresliSlunce(Turtle zofka) {
            zofka.setPenColor(Color.orange);
        for(int i = 0; i < 72; i++) {
            zofka.turnRight(5);
            zofka.move(5);
        }
//Paprsek 1
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.penUp();
            zofka.move(150);
            zofka.penDown();
            zofka.move(30);
            zofka.penUp();
//Presun
            zofka.turnLeft(180);
            zofka.move(92);
            zofka.turnLeft(90);
            zofka.move(60);
//Paprsek 2
            zofka.penDown();
            zofka.move(30);
            zofka.turnLeft(180);
            zofka.penUp();
            zofka.move(150);
            zofka.penDown();
            zofka.move(30);
            zofka.penUp();
//Presun
            zofka.turnLeft(180);
            zofka.penUp();
            zofka.move(92);
            zofka.turnLeft(45);

// Paprsek 3
            zofka.move(60);
            zofka.penDown();
            zofka.move(30);
            zofka.penUp();
            zofka.turnLeft(180);
            zofka.move(150);
            zofka.penDown();
            zofka.move(30);
//Presun
            zofka.turnLeft(180);
            zofka.penUp();
            zofka.move(92);
            zofka.turnRight(90);

//Paprsek 4
            zofka.move(60);
            zofka.penDown();
            zofka.move(30);
            zofka.penUp();
            zofka.turnLeft(180);
            zofka.move(150);
            zofka.penDown();
            zofka.move(30);
    }

    private void posunSeDolu2(Turtle zofka) {
        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(550);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.penDown();
    }


    private void nakresliDomecek(Turtle zofka) {
        zofka.setPenColor(Color.BLACK);
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
            zofka.move(100);
            zofka.turnRight(90);
            zofka.setPenColor(Color.RED);
            zofka.move(100);
            zofka.turnLeft(135);
            zofka.move(72);
            zofka.turnLeft(90);
            zofka.move(72);
            zofka.penUp();
        }

    private void presunSeNaDomecek2(Turtle zofka) {
            zofka.turnRight(135);
            zofka.move(100);
            zofka.penDown();
    }

    private void presunSeNaDomecek3(Turtle zofka) {
            zofka.turnLeft(135);
            zofka.move(300);
            zofka.turnLeft(90);
            zofka.penDown();
    }

    private void presunSeNaDomecek4(Turtle zofka) {
        zofka.turnLeft(135);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.penDown();
    }

    private void presunSeNaDomecek5(Turtle zofka) {
        zofka.turnLeft(135);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(180);
        zofka.penDown();
    }

    private void presunSeNaDomecek6(Turtle zofka) {
        zofka.turnLeft(45);
        zofka.move(300);
        zofka.turnLeft(180);
        zofka.penDown();
    }
    private void nakresliDomecky(Turtle zofka) {
        nakresliDomecek(zofka);
        presunSeNaDomecek2(zofka);
        nakresliDomecek(zofka);
        presunSeNaDomecek3(zofka);
        nakresliDomecek(zofka);
        presunSeNaDomecek4(zofka);
        nakresliDomecek(zofka);
        presunSeNaDomecek5(zofka);
        nakresliDomecek(zofka);
        presunSeNaDomecek6(zofka);
        nakresliDomecek(zofka);
    }

    private void nakresliTravu(Turtle zofka) {
        zofka.turnLeft(135);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(160);
        zofka.turnRight(90);
        zofka.setPenWidth(50);
        zofka.setPenColor(Color.GREEN);
        zofka.penDown();
        zofka.move(1100);
        zofka.penUp();

        zofka.turnRight(180);
        zofka.setPenWidth(6);
        zofka.setPenColor(Color.BLACK);
        zofka.move(900);
        zofka.turnLeft(90);
        zofka.move(550);
    }

    private void napisPismenoA(Turtle zofka) {
// Pismeno A
        zofka.penDown();
        zofka.turnRight(25);
        zofka.move(70);
        zofka.turnRight(130);
        zofka.move(70);
        zofka.turnRight(180);
        zofka.move(35);
        zofka.turnLeft(64);
        zofka.move(25);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(55);
    }

    private void napisPismenoI(Turtle zofka) {
//Pismeno I
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnLeft(180);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.penUp();
        }

    private void napisPismenoS(Turtle zofka) {
//Pismeno S
        zofka.move(35);
        zofka.turnLeft(145);
        zofka.penDown();
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);

        zofka.turnRight(160);

        zofka.penUp();
        zofka.move(4);
        zofka.turnLeft(15);
        zofka.move(4);
        zofka.turnLeft(15);
        zofka.move(4);
        zofka.turnLeft(15);
        zofka.move(4);
        zofka.turnLeft(15);
        zofka.move(4);
        zofka.turnLeft(15);
        zofka.move(4);
        zofka.turnLeft(15);
        zofka.move(4);
        zofka.turnLeft(15);
        zofka.move(5);
        zofka.turnLeft(15);
        zofka.move(5);
        zofka.turnLeft(15);
        zofka.move(5);
        zofka.turnLeft(15);
        zofka.move(5);
        zofka.turnLeft(15);
        zofka.move(5);
        zofka.turnLeft(15);
        zofka.move(5);
        zofka.turnLeft(15);

        zofka.penDown();
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);
        zofka.move(4);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
        zofka.move(5);
        zofka.turnRight(15);
    }

    private void napisPismenoH(Turtle zofka) {
//Pismeno H
        zofka.penUp();
        zofka.turnRight(105);
        zofka.move(45);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnLeft(180);

        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);

        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnLeft(180);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnLeft(93);
    }

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        posunSeDolu(zofka);
        nakresliPrase(zofka);
        posunSeNahoru(zofka);
        nakresliSlunce(zofka);
        posunSeDolu2(zofka);
        nakresliDomecky(zofka);
        nakresliTravu(zofka);
        napisPismenoA(zofka);
        napisPismenoI(zofka);
        napisPismenoS(zofka);
        napisPismenoH(zofka);
        napisPismenoA(zofka);


    }

}
