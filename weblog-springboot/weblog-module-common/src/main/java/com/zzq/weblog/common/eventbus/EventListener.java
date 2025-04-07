package com.zzq.weblog.common.eventbus;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-07-02 9:20
 * @description: TODO
 **/
public interface EventListener {
    void handleEvent(ArticleEvent weblogEvent);
}
