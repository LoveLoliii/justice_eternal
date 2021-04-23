package monster.loli.justice_eternal.vo;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ThreadVO extends CommonVO implements Serializable {
    private static final long serialVersionUID = 3956287435612937201L;


    private Long id;
    private String title;
    private String author;
    private Integer reply_num;
}
