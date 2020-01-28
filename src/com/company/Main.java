package com.company;

import com.company.momento.Editor;
import com.company.momento.History;
import com.company.state.Canvas;
import com.company.state.SelectionTool;
import com.company.state.abuse.Stopwatch;

public class Main {

    public static void main(String[] args) {
        User user = new User("Mosh", 30);
        //setting a new instance
        user.sayHello();

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        var mailService = new MailService();
        mailService.sendEmail();

        var textBox = new TextBox();
        textBox.enable();

        drawUIControl(new TextBox());

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();

    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }
}
