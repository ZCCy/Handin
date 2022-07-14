package com.zccy.handin.mapper;

import com.zccy.handin.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
}
