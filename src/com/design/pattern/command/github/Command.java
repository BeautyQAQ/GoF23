package com.design.pattern.command.github;

public interface Command {
    void execute();

    void undo();

    void redo();
}
