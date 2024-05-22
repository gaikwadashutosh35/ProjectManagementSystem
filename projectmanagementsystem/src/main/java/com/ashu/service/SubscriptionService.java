package com.ashu.service;

import com.ashu.modal.PlanType;
import com.ashu.modal.Subscription;
import com.ashu.modal.User;

public interface SubscriptionService {

    Subscription createSubscription(User user);

    Subscription getUsersSubscription(Long userId) throws Exception;

    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
