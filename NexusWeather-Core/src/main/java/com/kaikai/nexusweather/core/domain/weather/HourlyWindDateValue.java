package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.OffsetDateTime;

/**
 * @author kaikai
 * @createTime 2021年12月15日 16:05
 * @Description : 带时间戳的风速风向
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HourlyWindDateValue {
    /**
     * 日期时间
     */
    @JSONField(name="datetime")
    OffsetDateTime datetime;
    /**
     * 风速
     */
    @JSONField(name="speed")
    Double speed;
    /**
     * 风向
     */
    @JSONField(name="direction")
    String direction;
}
