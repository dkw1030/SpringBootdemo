package com.example.demo.mapper;

import com.example.demo.pojo.TestIndex;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface testMapper {
    List<TestIndex> queryData();

    List<TestIndex> findData(int id);

    int addData(TestIndex testIndex);

    int deleteData(int id);

    int changeData(int id);
}
