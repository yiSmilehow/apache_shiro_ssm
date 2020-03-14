package com.shiroapache.web.shiro;

import com.shiroapache.pojo.Resources;
import com.shiroapache.service.ResourcesService;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FilterChainDefinitionMapBuilder {

    @Resource
    private ResourcesService resourcesService;

    /**
     * 查询所有的资源权限
     */
    public Map<String, String> builder() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        List<Resources> resourcesList = resourcesService.selectAllByStatusAndSortNumAsc();
        for (Resources resources : resourcesList) {
            map.put(resources.getKey(), resources.getVal());
        }
        return map;
    }

}
