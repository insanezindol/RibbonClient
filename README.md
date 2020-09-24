# RibbonClient

Spring Cloud provides client-side load balancing through the use of Netflix Ribbon. Ribbon's load balancing mechanism can be supplemented with retries.

In a cloud-based application, it's a common practice for a service to make requests to other services. But in such a dynamic and volatile environment, networks could fail or services could be temporarily unavailable.

We want to handle failures in a graceful manner and recover quickly. In many cases, these issues are short-lived. If we repeated the same request shortly after the failure occurred, maybe it would succeed.

This practice helps us to improve the application's resilience, which is one of the key aspects of a reliable cloud application.

Nevertheless, we need to keep an eye on retries since they can also lead to bad situations. For example, they can increase latency which might not be desirable.
