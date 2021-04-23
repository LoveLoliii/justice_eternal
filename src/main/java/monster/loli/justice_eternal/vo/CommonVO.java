package monster.loli.justice_eternal.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class CommonVO implements Serializable {

    private static final long serialVersionUID = 6332697217948480782L;
    Integer currentPage = 1;// 当前页数
    Integer pageSize = 10;// 每页记录数
    String sorter;// 排序
}
