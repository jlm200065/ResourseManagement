package com.jlm.data.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import java.util.List;

import com.jlm.data.mapper.DataAdminInformationMapper;
import com.jlm.data.entity.Information;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author auto gen
 * @since 2025-05-22
 */
@Api(tags = {"API"})
@AllArgsConstructor
@RestController
@RequestMapping("/dataAdmin/information")
public class DataAdminInformationController {

    private final DataAdminInformationMapper mapper;

    @ApiOperation("新增")
    @PostMapping("/create")
    public void add(@RequestBody Information model){
        mapper.insert(model);
    }


    @ApiOperation("删除")
    @ApiImplicitParam(value = "id", name = "id", dataTypeClass = Long.class, paramType = "query", required = true)
    @DeleteMapping("/del")
    public void del(Long id){
        mapper.deleteById(id);
    }


    @ApiOperation("查找")
    @ApiImplicitParam(value = "id", name = "id", dataTypeClass = Long.class, paramType = "path", required = true)
    @GetMapping("/{id}")
    public Information get(@PathVariable("id") Long id){
        return mapper.selectById(id);
    }

    @ApiOperation("修改")
    @PutMapping("/update")
    public void update(@RequestBody Information model){
        mapper.updateById(model);
    }

    @ApiOperation("列表")
    @PostMapping("/list")
    public List<Information> list(@RequestBody Information entity){
        return mapper.selectList(this.buildQueryObject(entity));
    }

    @ApiOperation("分页查询")
    @GetMapping("/page")
    public IPage<Information> pageList(Information entity, int size, int current){
        QueryWrapper<Information> query = this.buildQueryObject(entity);
        Page<Information> page = new Page<>(current, size);
        IPage<Information> result = mapper.selectPage(page, query);
        return result;
    }


    private QueryWrapper<Information> buildQueryObject(Information entity){
        QueryWrapper<Information> query = new QueryWrapper<>();
            if(entity.getId() != null){
            query.eq("id", entity.getId());
            }
            if(entity.getInfo() != null){
            query.eq("info", entity.getInfo());
            }
        return query;
    }


}
