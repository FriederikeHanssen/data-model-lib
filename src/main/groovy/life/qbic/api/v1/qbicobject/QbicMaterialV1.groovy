package life.qbic.api.v1.qbicobject

import ch.ethz.sis.openbis.generic.asapi.v3.dto.material.Material

class QbicMaterialV1 {

    private final Material openBisMaterial

    QbicMaterialV1(openBisMaterial){
        this.openBisMaterial = openBisMaterial
    }

}
