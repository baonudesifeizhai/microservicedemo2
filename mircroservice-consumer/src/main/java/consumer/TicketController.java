package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import consumer.User;
import consumer.TicketService;
@RestController
public class TicketController {
    //注入service
    @Autowired TicketService ticketService;

    /*
     * 查询车票信息的接口
     */
    @GetMapping(value = "/getTicketInfo/{id}")
    public User queryTicketInfo(@PathVariable("id") Long id) {
        return ticketService.queryTicketInfo(id);
    }
}