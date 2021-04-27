/// wedocode.net Do more with less!
package net.wedocode;


import net.wedocode.structural.adapter.*;
import net.wedocode.structural.bridge.*;
import net.wedocode.structural.composite.*;
import net.wedocode.structural.decorator.*;
import net.wedocode.structural.decorator.pizzadecorators.*;
import net.wedocode.structural.flyweight.*;
import net.wedocode.structural.proxy.*;

import net.wedocode.creational.builder.*;
import net.wedocode.creational.singleton.*;
import net.wedocode.creational.abstractFactory.*;
import net.wedocode.creational.factoryMethod.*;
import net.wedocode.creational.prototype.Developer;
import net.wedocode.creational.prototype.Tester;

import net.wedocode.behavioural.interpreter.*;
import net.wedocode.behavioural.iterator.ConcreteAggregate;
import net.wedocode.behavioural.mediator.*;
import net.wedocode.behavioural.memento.*;
import net.wedocode.behavioural.observer.*;
import net.wedocode.behavioural.state.*;
import net.wedocode.behavioural.stategy.*;
import net.wedocode.behavioural.chainOfResponsibility.*;
import net.wedocode.behavioural.command.*;
import net.wedocode.behavioural.templatemethod.*;
import net.wedocode.behavioural.visitor.*;



import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Starting design patterns demo comment out that which is not of interest.");

        // Structure Pattens. See the readme files in the corresponding packages for me details.
        runBridgeSample();
        runDecoratorSample();
        runAdapterSample();
        runCompositeSample();
        runflyWeightSample();
        runProxySample();
        runFacadeSample();

        // Creational Patterns
        runAbstractFactory();
        runBuilder();
        runFactoryMethod();
        runPrototype();
        runSingleton();

        // Behavioural Patterns
        runChainOfResponsibility();
        runCommand();
        runInterpreter();
        runIterator();
        runMediator();
        runMemento();
        runObserver();
        runState();
        runStrategy();
        runTemplateMethod();
        runVisitor();

        System.out.println("Happy Learning!");
    }

    private static void runVisitor() {
        System.out.println(">>> Visitor <<<");
        Director bob = new Director();
        bob.Name = "Bob";
        bob.MonthlySalary = 5000;

        Director sue = new Director();
        sue.Name = "Sue";
        sue.MonthlySalary = 4000;

        Supervisor jim = new Supervisor();
        jim.Name = "Jim";
        jim.MonthlySalary = 2000;

        Supervisor tom = new Supervisor();
        tom.Name = "Tom";
        tom.MonthlySalary = 1800;

        Supervisor mel = new Supervisor();
        mel.Name = "Mel";
        mel.MonthlySalary = 1900;

        bob.Subordinates.add(sue);
        bob.Subordinates.add(jim);
        sue.Subordinates.add(tom);
        sue.Subordinates.add(mel);

        OrganisationalStructure org = new OrganisationalStructure(bob);

        PayrollVisitor payroll = new PayrollVisitor();
        PayRaiseVisitor payrise = new PayRaiseVisitor(0.05);

        org.Accept(payroll);
        org.Accept(payrise);
        org.Accept(payroll);

        System.out.printf("Total pay increase = %s.%n", payrise.TotalIncrease);
        System.out.println();
    }

    private static void runTemplateMethod() {
        System.out.println(">>> Template Method <<<");
        SpadeHiringProcess spadeHiringProcess = new SpadeHiringProcess();
        spadeHiringProcess.CheckOut();

        CementMixerHiringProcess cementMixerHiringProcess = new CementMixerHiringProcess();
        cementMixerHiringProcess.CheckOut();

        System.out.println();
    }

    private static void runStrategy() {
        System.out.println(">>> Strategy <<<");
        Bank bank = new Bank();
        bank.calculationAlgorithm = new DebitCalculation();
        bank.doSomeCalculation(100D);

        bank.calculationAlgorithm = new CreditCalculation();
        bank.doSomeCalculation(100D);

        bank.calculationAlgorithm = new TrackingCalculation();
        bank.doSomeCalculation(100D);
        System.out.println();
    }

    private static void runState() {
        System.out.println(">>> State <<<");
        AudioPlayer player = new AudioPlayer(new StandbyState());
        player.pressPlay();
        player.pressAudioSource();
        player.pressPlay();
        player.pressPlay();
        player.pressAudioSource();
        player.pressPlay();
        player.pressAudioSource();
        System.out.println();
    }

    private static void runObserver() {
        System.out.println(">>> Observer <<<");
        EventReceiver receiver = new EventReceiver();
        EventMonitor emailer = new EventEmailer(receiver);
        receiver.Attach(emailer);
        EventMonitor logger = new EventLogger(receiver);
        receiver.Attach(logger);
        receiver.logMessage("Message with two observers.");
        System.out.println();
    }

    private static void delayProcessing(){
        try {
            Thread.sleep( 2000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    private static void runMemento() {
        System.out.println(">>> Memento <<<");
        // Initialise book
        Book book = new Book();
        book.set_isbn("0450488357");
        book.set_title("The Tommyknockers");
        book.set_author("Stephen King");
        System.out.println("Book created: " + book.toString());
        delayProcessing();
        // Set undo point
        CareTaker history = new CareTaker();
        history.Memento = book.createUndo();
        // Modify book
        book.set_isbn("0450488333");
        book.set_title("The Tommy-knockers");
        book.set_author("Changed Stephen King");
        System.out.println("Book modified: " + book.toString());
        // Undo
        book.restoreFromUndo(history.Memento);
        System.out.println("Book restored: " + book.toString());
        System.out.println();
    }

    private static void runMediator() {
        System.out.println(">>> Mediator <<<");

        Mediator mediator = new Mediator();

        Presenter presenter = new Presenter(mediator);
        presenter.Name = "Bob";
        mediator.Presenter = presenter;

        Attendee sam = new Attendee(mediator);
        sam.Name = "Sam";
        Attendee jim = new Attendee(mediator);
        jim.Name = "Jim";
        mediator.Attendees = new ArrayList<>(Arrays.asList(sam, jim));

        presenter.sendNewImageUrl("Slide1.jpg");
        sam.askQuestion("How often should I do this?");
        presenter.answerQuestion("Daily", sam);
        presenter.sendNewImageUrl("Slide2.jpg");

        System.out.println();
    }

    private static void runIterator() {

        System.out.println(">>> Iterator <<<");

        ConcreteAggregate aggr = new ConcreteAggregate();
        aggr.add("One");
        aggr.add("Two");
        aggr.add("Three");
        aggr.add("Four");
        aggr.add("Five");
        while (aggr.hasNext()){
            String item = (String)aggr.next();
            System.out.println(item);
        }

        System.out.println();
    }

    private static void runInterpreter() {

        System.out.println(">>> Run Interpreter <<<");

        Parser parser = new Parser();
        // Domain specific language modeling
        String[] commands = new String[]
                {
                        "+ 5 6",
                        "- 6 5",
                        "+ - 4 5 6",
                        "+ 4 - 5 6",
                        "+ - + - - 2 3 4 + - -5 6 + -7 8 9 10"
                };

        for (String command : commands)
        {
            ExpressionBase expression = parser.parse(command);
            System.out.printf("%s = %s%n", expression, expression.evaluate());
        }
    }

    private static void runCommand() {
        System.out.println(">>> Command <<<");

        Robot robot = new Robot();
        RobotController robotController = new RobotController();

        MoveCommand moveCommand = new MoveCommand(robot);
        moveCommand.forwardDistance = 2000;
        robotController.commands.add(moveCommand);

        RotateCommand rotateCommand = new RotateCommand(robot);
        rotateCommand.leftRotation = 45D;
        robotController.commands.add(rotateCommand);


        ScoopCommand scoopCommand = new ScoopCommand(robot);
        scoopCommand.scoopUpwards = true;
        robotController.commands.add(scoopCommand);

        robotController.executeCommands();
        robotController.undoCommends(3);

        System.out.println();
    }

    // Chain up and configure the classes.
    private static void runChainOfResponsibility() {
        System.out.println(">>> Chain of Responsibility <<<");

        CoinHandlerBase h5 = new FiftyCentsHandler();
        CoinHandlerBase h10 = new TenCentsHandler();
        CoinHandlerBase h20 = new TwentyCentsHandler();
        CoinHandlerBase h50 = new FiftyCentsHandler();
        CoinHandlerBase h100 = new OneRandHandler();
        h5.setSuccessor(h10);
        h10.setSuccessor(h20);
        h20.setSuccessor(h50);
        h50.setSuccessor(h100);

        Coin tenCents = new Coin (24.49F,  6.5F );
        Coin fiftyCents = new Coin (27.31F, 8.01F );
        Coin counterfeitOneRand = new Coin (22.5F, 9F );

        h5.handleCoin(tenCents);
        h5.handleCoin(fiftyCents);
        h5.handleCoin(counterfeitOneRand);

        System.out.println();
    }

    private static void runSingleton() {
        System.out.println(">>> Singleton <<<");
        MySingleton singleton = MySingleton.getMyInstance();
        System.out.println(singleton.getDescription());
        System.out.println();
    }

    private static void runPrototype() throws CloneNotSupportedException {
        System.out.println(">>> Prototype <<<");
        Developer developer = new Developer();
        developer.Name = "Shaun Kiesewetter";
        developer.Role = "Architect";
        developer.language = "C#";
        System.out.println(developer.toString());
        Developer devCopy = (Developer) developer.CloneEmployee();
        System.out.println(devCopy.toString());

        Tester tester = new Tester();
        tester.Name = "Jono";
        tester.Role = "Tester";
        tester.language = "Powershell";
        System.out.println(tester.toString());
        Tester testerCopy = (Tester) tester.CloneEmployee();
        System.out.println(testerCopy.toString());
        System.out.println();
    }

    private static void runFactoryMethod() {
        System.out.println(">>> Factory Method <<<");

        BikeFactory suzukiFactory = new SuzukiBikeFactory();
        Bike suzukiDirtBike = suzukiFactory.CreateBike("dirtbike");
        System.out.println("Expected target type Suzuki Dirt bike: " +  suzukiDirtBike.getClass());
        Bike suzukiCruiser = suzukiFactory.CreateBike("cruiser");
        System.out.println("Expected target type Suzuki Cruiser: " +  suzukiCruiser.getClass());

        BikeFactory hondaFactory = new HondaBikeFactory();
        Bike hondaDirtBike = hondaFactory.CreateBike("dirtbike");
        System.out.println("Expected target type honda Dirt bike: " +  hondaDirtBike.getClass());
        Bike hondaCruiser = hondaFactory.CreateBike("cruiser");
        System.out.println("Expected target type honda Cruiser: " +  hondaCruiser.getClass());

        System.out.println();

    }

    private static void runBuilder() {
        System.out.println(">>> Builder <<<");

        FrameDirector director = new FrameDirector();

        EditableRectangleFrameBuilder editableRectangleFrameBuilder = new EditableRectangleFrameBuilder();
        director.MakeFrame(editableRectangleFrameBuilder);
        System.out.println(editableRectangleFrameBuilder.getFrame().toString());

        FixedSquareFrameBuilder fixedSquareFrameBuilder = new FixedSquareFrameBuilder();
        director.MakeFrame(fixedSquareFrameBuilder);
        System.out.println(fixedSquareFrameBuilder.getFrame().toString());

        System.out.println();
    }


    private static void runAbstractFactory() {
        System.out.println(">>> AbstractFactory <<<");

        PurchaseFactory spf = new StandardPurchaseFactory();
        Client standard = new Client(spf);
        System.out.println(standard.getClientPackaging().getClass());
        System.out.println(standard.getDeliveryDocument().getClass());

        PurchaseFactory dpf = new DelicatePurchaseFactory();
        Client delicate = new Client(dpf);
        System.out.println(delicate.getClientPackaging().getClass());
        System.out.println(delicate.getDeliveryDocument().getClass());

        System.out.println();
    }

    private static void runFacadeSample() {
    }

    private static void runProxySample() {
        CalculatorBase calculatorBase = new NumberMultiplierProxy();
        System.out.println(">>> Proxy <<<");
        // 9 values retrieved from cache
        for(int i = 0; i < 10; i++){
            System.out.println(calculatorBase.Calculate());
        }
        System.out.println();
    }

    // The flyweight pattern is used for memory preservation,
    // You can imagine thousands of these targets being created in
    // a real game context. Here I create only a few to get the idea.
    // The data defines the target type, and we only store one copy
    // of the data for each target type.
    private static void runflyWeightSample() {

        System.out.println(">>> FlyWeight <<<");

        UnitFactory unitFactory = new UnitFactory();

        Target tank1 = new Target();
        tank1.UnitData = unitFactory.GetUnit("Tank");

        Target tank2 = new Target();
        tank2.UnitData = unitFactory.GetUnit("Tank");

        Target soldier = new Target();
        soldier.UnitData = unitFactory.GetUnit("Infantry");

        Target marine = new Target();
        marine.UnitData = unitFactory.GetUnit("Marine");

        marine.UnitData.FireAt(soldier);
        tank2.UnitData.FireAt(tank1);

        System.out.println();

    }


    private static void runCompositeSample() {
        Employee shaun = new Employee();
        shaun.setName("Shaun");

        Employee bob = new Employee();
        bob.setName("Bob");
        shaun.addSubOrdinate(bob);

        Employee kate = new Employee();
        kate.setName("Kate");
        shaun.addSubOrdinate(kate);

        Employee jim = new Employee();
        jim.setName("Jim");
        kate.addSubOrdinate(jim);

        Employee wayne = new Employee();
        wayne.setName("Wayne");
        jim.addSubOrdinate(wayne);

        Employee robert = new Employee();
        robert.setName("Robert");
        wayne.addSubOrdinate(robert);

        Contractor shady = new Contractor();
        shady.setName("Shady");
        jim.addSubOrdinate(shady);

        Contractor kim = new Contractor();
        kim.setName("Kim");
        jim.addSubOrdinate(kim);

        System.out.println(">>> Composite <<<");
        printComposite(shaun);
        System.out.println();

    }



    private static void runAdapterSample() {
        // We have a pizza oven
        PizzaOven pizzaOven = new PizzaOven();
        // We have a hamburger that typically does not go into the pizza oven but more important does not implement cookable
        Hamburger hamburger = new Hamburger();
        // We create an adapter that support "Cookable" so that it can fit into the oven's cook method.
        // We pass in the hamburger as the adaptee
        PizzaCookingAdapter pizzaCookingAdapter = new PizzaCookingAdapter(hamburger);
        // We cook the hamburger
        System.out.println(">>> Adapter <<<");
        System.out.println(pizzaOven.Cook(pizzaCookingAdapter));
        System.out.println();
    }

    private static void runDecoratorSample() {
        // We must start off our construction chain with a legacy pizza
        LargePizza largePizza = new LargePizza();
        printPizza(largePizza);

        // Lets inject additional functionality into our large pizza domain with our decorator
        ExtraAvoDecorator avoPizza = new ExtraAvoDecorator(largePizza);
        printPizza(avoPizza);

        // Now we can take the decorated instance and decorate it some more.
        ExtraCheeseDecorator extraCheese = new ExtraCheeseDecorator(avoPizza);
        printPizza(extraCheese);

        // Lets not forget the olives!
        ExtraOlivesDecorator extraOlives = new ExtraOlivesDecorator(extraCheese);
        printPizza(extraOlives);
    }

    // The use case variation is orchestrated at the client level.
    // Adding a new discount scheme will add only one class, as the two abstractions are not tied together
    private static void runBridgeSample() {
        // In this case we sell a yearly license to a student.
        YearlyLicense yearlyLicense = new YearlyLicense(new StudentDiscount());
        printLicense(yearlyLicense);

        // Or we can sell a month license to a senior.
        MonthlyLicense monthlyLicense = new MonthlyLicense(new SeniorDiscount());
        printLicense(monthlyLicense);
        // Or we simply do not apply a discount
        MonthlyLicense monthlyLicense1 = new MonthlyLicense(new NoDiscount());
        printLicense(monthlyLicense1);

        // No license
        YearlyLicense yearlyLicense1 = new YearlyLicense();
        printLicense(yearlyLicense1);
    }

    private static void printPizza(Pizza pizza)
    {
        System.out.println(">>> Decorator <<<");
        System.out.println(pizza.getDescription() + " cost: " + pizza.calculateCost());
        System.out.println();
    }

    private static void printLicense(MovieLicense movieLicense)
    {
        System.out.println(">>> Bridge <<<");
        System.out.println("Movie License agreement");
        System.out.println(movieLicense.getDescription());
        System.out.println("Total value: " + movieLicense.getPrice());
        System.out.println();
    }

    private static void printComposite(Worker worker) {

        // Only Employees have subordinates
        if (worker instanceof Employee)
        {
            Employee employee = (Employee) worker;
            System.out.println("Processing employee: " + worker.getName());
            if (employee.getCount() > 0){
                for(Worker report: employee){
                    System.out.println("   " + report.getName() + " is reporting to " + worker.getName());
                }
                // process each reporter ...
                for (Worker report: employee){
                    printComposite(report);
                }
            } else
            {
                System.out.println(worker.getName() + " has nobody reporting to them.");
            }
        }

        // Contractors are leaf nodes
        if (worker instanceof Contractor)
        {
            System.out.println("Contractor: " + worker.getName());
        }
    }
}
