package team.seven.ticketsquery.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @description: 车次
 * @author: ZhouLe
 * @create: 2022-06-17
 * @version: 1.0
 */
@Data
@TableName("tb_routertrain")
public class TrainNumber {
    private String routertrainId;
    private String trainId;
    private String routertrainType;
    private String departureStationId;
    private String arrivalStationId;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date departureTime;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date arrivalTime;

}