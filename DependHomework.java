package Homework;

import org.testng.annotations.Test;

public class DependHomework {

        @Test(dependsOnMethods = {"a5"})
        public void a1() {
            System.out.println("a1");
        }


        @Test(dependsOnMethods = {"a3"})
        public void a2() {
            System.out.println("a2");
        }

        @Test
        public void a3() {
            System.out.println("a3");

        }

        @Test(dependsOnMethods = {"a1"})
        public void a4() {
            System.out.println("a4");
        }

        @Test
        public void a5() {
            System.out.println("a5");
        }


    }
