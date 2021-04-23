package monster.loli.justice_eternal.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PaginationBuilder {

    private PaginationBuilder() {

    }

    public static Map<String, Object> buildResult(List<LinkedHashMap<String, Object>> resultList, long total, Integer currentPage, Integer pageSize) {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("list", resultList);
        LinkedHashMap<String, Long> paginationMap = new LinkedHashMap<>();
        paginationMap.put("total", total);
        paginationMap.put("pageSize", (long) pageSize);
        paginationMap.put("current", (long) currentPage);
        resultMap.put("pagination", paginationMap);
        return resultMap;
    }

}