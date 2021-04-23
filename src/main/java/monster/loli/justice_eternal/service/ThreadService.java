package monster.loli.justice_eternal.service;

import monster.loli.justice_eternal.vo.ThreadVO;
import org.springframework.stereotype.Service;

import java.util.Map;


public interface ThreadService {
    Map<String, Object> queryThread(ThreadVO threadVO);
}
