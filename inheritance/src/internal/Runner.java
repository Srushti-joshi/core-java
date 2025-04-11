package internal;

import external.*;

public class Runner {
        public static void main(String[] args) {
            Photo photo = new Photo();
            photo.display();

            Photo digitalPhoto = new DigitalPhoto();
            digitalPhoto.display();

            DigitalPhoto dp = new DigitalPhoto();
            dp.display();
            dp.edit();
            Box box = new Box();
            box.open();

            Box giftBox = new GiftBox();
            giftBox.open();

            GiftBox gb = new GiftBox();
            gb.open();
            gb.wrap();
            Rubber rubber = new Rubber();
            rubber.stretch();
            Switch simpleSwitch = new Switch();
            simpleSwitch.turnOn();

            Switch electricSwitch = new ElectricSwitch();
            electricSwitch.turnOn();

            ElectricSwitch es = new ElectricSwitch();
            es.turnOn();
            es.turnOff();
            Paper paper = new Paper();
            paper.write();

            Paper notebookPaper = new NotebookPaper();
            notebookPaper.write();

            NotebookPaper np = new NotebookPaper();
            np.write();
            np.bind();
            Soap soap = new Soap();
            soap.cleanse();

            Soap scentedSoap = new ScentedSoap();
            scentedSoap.cleanse();

            ScentedSoap ss = new ScentedSoap();
            ss.cleanse();
            ss.addFragrance();
            Hindu hindu = new Hindu();
            hindu.worship();

            Hindu devotee = new Devotee();
            devotee.worship();

            Devotee d = new Devotee();
            d.worship();
            d.visitTemple();
            Perfume perfume = new Perfume();
            perfume.spray();

            Perfume luxuryPerfume = new LuxuryPerfume();
            luxuryPerfume.spray();

            LuxuryPerfume lp = new LuxuryPerfume();
            lp.spray();
            lp.longLastingEffect();
            Google google = new Google();
            google.service();

            Google googleSearch = new GoogleSearch();
            googleSearch.service();

            GoogleSearch gs = new GoogleSearch();
            gs.service();
            gs.searchFeature();
            Clip clip = new Clip();
            clip.hold();

            Clip paperClip = new PaperClip();
            paperClip.hold();

            PaperClip pc = new PaperClip();
            pc.hold();
            pc.bend(); Mail mail = new Mail();
            mail.send();

            Mail email = new Email();
            email.send();

            Email e = new Email();
            e.send();
            e.attachFile();
            Fruit fruit = new Fruit();
            fruit.taste();

            Fruit apple = new Apple();
            apple.taste();

            Apple a = new Apple();
            a.taste();
            a.color();
            Pant pant = new Pant();
            pant.wear();

            Pant jeans = new Jeans();
            jeans.wear();

            Jeans j = new Jeans();
            j.wear();
            j.material();
            Eye eye = new Eye();
            eye.see();

            Eye blueEye = new BlueEye();
            blueEye.see();

            BlueEye be = new BlueEye();
            be.see();
            be.eyeColor();
            Leg leg = new Leg();
            leg.walk();

            Leg roboticLeg = new RoboticLeg();
            roboticLeg.walk();

            RoboticLeg rl = new RoboticLeg();
            rl.walk();
            rl.advancedFeatures();
            Swim swim = new Swim();
            swim.move();

            Swim fish = new Fish();
            fish.move();

            Fish f = new Fish();
            f.move();
            f.breatheUnderwater();
            Nail nail = new Nail();
            nail.grow();

            Nail fingernail = new Fingernail();
            fingernail.grow();

            Fingernail fn = new Fingernail();
            fn.grow();
            fn.paint();



        }
    }



