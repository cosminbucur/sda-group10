package com.bucur.patterns.behavioral.visitor;

import com.bucur.patterns.behavioral.visitor.shapes.MyShape;
import com.bucur.patterns.behavioral.visitor.visitor.XMLExportVisitor;

public class DemoVisitorPattern {

    public static void main(String[] args) {

        // TODO: create a main compound shape with a dot a circle and a rectangle

        // TODO: create a child shape with a dot

        // TODO: export a circle and main shape
    }

    private static void export(MyShape... myShapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(myShapes));
    }
}
