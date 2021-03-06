package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.OffsetDateTime;

/**
 * @author kaikai
 * @createTime 2021年12月15日 17:18
 * @Description : 带时间戳的指数、描述
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DateDesc {
    /**
     * 日期时间
     */
    @JSONField(name="datetime")
    OffsetDateTime datetime;
    /**
     * 自然语言描述
     */
    @JSONField(name="desc")
    String desc;
    /**
     * 指数
     */
    @JSONField(name="index")
    int index;
}
