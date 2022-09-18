package com.gdsdxy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.gdsdxy.entity.Goods;
import com.gdsdxy.mapper.GoodsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringBoot05MyBatisPlusApplicationTests {
    @Resource
    private GoodsMapper goodsMapper;

    @Test
    void selectAll() {
        List<Goods> goods = goodsMapper.selectList(null);
        goods.forEach(System.out::println);
    }

    @Test
    void queryByID() {
        Goods goods = goodsMapper.selectById(1);
        System.out.println("goods = " + goods);
    }

    @Test
    void queryByTypeNameAndFlag() {
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        wrapper.select("typeName", "flag");

        List<Goods> goods = goodsMapper.selectList(wrapper);
        goods.forEach(System.out::println);
    }

    @Test
    void queryBy8() {
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        wrapper.gt("price", 30000)
                .eq("star", 4)
                .or()
                .lt("price", 1000)
                .select("id","name","price","star");
        List<Goods> goods = goodsMapper.selectList(wrapper);
        goods.forEach(System.out::println);
    }

    @Test
    void insertTest() {
        Goods goods = new Goods();
        goods.setId(30);
        goods.setName("测试商品");
        int insert = goodsMapper.insert(goods);
        System.out.println(insert > 0 ? "添加成功" : "添加失败");
    }

    @Test
    void updateTest() {
        Goods goods = new Goods();
        goods.setId(30);
        goods.setName("修改后测试商品");
        int update = goodsMapper.updateById(goods);
        System.out.println(update > 0 ? "修改成功" : "修改失败");
    }

    @Test
    void updateAllFlag() {
        UpdateWrapper<Goods> wrapper = new UpdateWrapper<>();
        wrapper.set("flag", 0);
        int update = goodsMapper.update(null, wrapper);
        System.out.println(update > 0 ? "修改成功" : "修改失败");
    }

    @Test
    void update12() {
        UpdateWrapper<Goods> wrapper = new UpdateWrapper<>();
        wrapper.set("flag", 1).set("star", 5).eq("typeName", "饼干糕点");
        int update = goodsMapper.update(null, wrapper);
        System.out.println(update > 0 ? "修改成功" : "修改失败");
    }

    @Test
    void deleteById() {
        int result = goodsMapper.deleteById(30);
        System.out.println(result > 0 ? "删除成功" : "删除失败");
    }

    @Test
    void deleteBy14() {
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        wrapper.eq("star", 4);
        int result = goodsMapper.delete(wrapper);
        System.out.println(result > 0 ? "删除成功" : "删除失败");
    }

    @Test
    void deleteBy15() {
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        wrapper.lt("price", 1000);
        int result = goodsMapper.delete(wrapper);
        System.out.println(result > 0 ? "删除成功" : "删除失败");
    }

}
