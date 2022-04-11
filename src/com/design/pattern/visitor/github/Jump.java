package com.design.pattern.visitor.github;

/**
 * 每当我们需要为动物添加新动作时我们就必须修改动物。
 * 但现在我们不必改变它们。
 * 例如，假设我们被要求向动物添加跳跃行为，我们可以通过创建新的访问者来添加它
 */
public class Jump implements AnimalOperation {

    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Jumped 20 feet high! on to the tree!");        
    }

    @Override
    public void visitLion(Lion lion) {
        System.out.println("Jumped 7 feet! Back on the ground!");        
    }

    @Override
    public void visitDolphin(Dolphin dolphin) {
        System.out.println("Walked on water a little and disappeared");        
    }
    
}
