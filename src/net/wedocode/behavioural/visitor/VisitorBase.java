package net.wedocode.behavioural.visitor;

// VisitorBase
public abstract class VisitorBase
{
    public abstract void visit(Supervisor employee);

    public abstract void visit(Director employee);
}