package com.bucur.patterns.behavioral.visitor.visitor;

import com.bucur.patterns.behavioral.visitor.shapes.Circle;
import com.bucur.patterns.behavioral.visitor.shapes.Dot;
import com.bucur.patterns.behavioral.visitor.shapes.MyCompoundShape;
import com.bucur.patterns.behavioral.visitor.shapes.MyShape;
import com.bucur.patterns.behavioral.visitor.shapes.Rectangle;

public class XMLExportVisitor implements Visitor {

    // TODO: implement this
    public String export(MyShape... args) {
        return "";
    }

    // TODO: implement this
    public String visitDot(Dot d) {
        return "";
    }

    // TODO: implement this
    public String visitCircle(Circle c) {
        return "";
    }

    // TODO: implement this
    public String visitRectangle(Rectangle r) {
        return "";
    }

    // TODO: implement this
    public String visitCompoundGraphic(MyCompoundShape cs) {
        return "";
    }

}
