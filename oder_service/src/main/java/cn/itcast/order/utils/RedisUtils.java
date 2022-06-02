package cn.itcast.order.utils;

import cn.itcast.order.exceptions.BusinessException;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtils {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    /***
    * 添加 键值
    */
    public void set(String key, Object value, Long expireTime) {
        if(expireTime < 0 ) {
            throw new BusinessException("输入过期时间小于0");
        }else{
            redisTemplate.opsForValue().set(key,value,expireTime, TimeUnit.SECONDS);
        }

    }
    /***
     * 获取键值
     */
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

}
