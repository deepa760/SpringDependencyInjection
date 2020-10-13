package org.example.springDI.util;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScannerInputService implements UserInputService {


    private Scanner scanner;

    @Autowired
    public ScannerInputService(Scanner scanner) {
        super();
        this.scanner = scanner;
    }

    @Override
    public String getString() {

        return scanner.nextLine();
    }

    @Override
    public int getInt() {

        return scanner.nextInt();
    }

}