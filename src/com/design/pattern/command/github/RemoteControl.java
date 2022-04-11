package com.design.pattern.command.github;

/**
 * Invoker
 * 客户端与之进行交互以处理任何命令
 */
public class RemoteControl {
    public void submit(Command command){
        command.execute();
    }
}
