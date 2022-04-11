package com.design.pattern.visitor.github;

/**
 * 游客
 */
public interface AnimalOperation {
    void visitMonkey(Monkey monkey);
    void visitLion(Lion lion);
    void visitDolphin(Dolphin dolphin);
}
