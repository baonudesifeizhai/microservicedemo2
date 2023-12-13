package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import consumer.User;

@Service
public class TicketService {
    @Autowired
    private RestTemplate restTemplate;

    /*
     * 查询车票信息时查询用户的信息（这里为了简化操作就不对车票信息进行查询，直接去调用查询用户信息的接口）
     */
    public User queryTicketInfo(Long id) {
        //向用户微服务中的接口发送请求的地址
        String url = "http://localhost:8081/getUserInfo/"+ id;
        return restTemplate.getForObject(url, User.class);
    }
}