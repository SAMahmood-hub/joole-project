package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.TechnicalDetail;
import java.util.List;

public interface TechnicalDetailService {
    TechnicalDetail saveTechnicalDetail(TechnicalDetail technicalDetail);

    List<TechnicalDetail> fetchTechnicalDetailList();

    TechnicalDetail fetchTechnicalDetailById(Integer id);

    void deleteTechnicalDetailById(Integer id);

    TechnicalDetail updateTechnicalDetailById(TechnicalDetail technicalDetail);
}