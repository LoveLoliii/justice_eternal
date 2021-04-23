package monster.loli.justice_eternal.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class PostVO extends CommonVO implements Serializable {
    private static final long serialVersionUID = 6332697217948411782L;

    private Long id;
    private Integer floor;
    private String author;
    private String content;
    private Date time;
    private Long thread_id;
}
