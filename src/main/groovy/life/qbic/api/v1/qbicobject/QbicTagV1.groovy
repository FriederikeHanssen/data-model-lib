package life.qbic.api.v1.qbicobject

import ch.ethz.sis.openbis.generic.asapi.v3.dto.tag.Tag
import life.qbic.api.v1.openbis.adapter.*

protected class QbicTagV1 implements TagAdapter{

    private final Tag openBisTag

    QbicTagV1(openBisTag){
        this.openBisTag = openBisTag
    }

    @Override
    String getCode() {
        return this.openBisTag.getCode()
    }

    @Override
    List<DataSetAdapter> getDataSets() {
        return this.openBisTag.collect{new QbicDataSetV1(it)}
    }

    @Override
    List<ExperimentAdapter> getExperiments() {
        return this.openBisTag.collect{ new QbicExperimentV1(it) }
    }

    @Override
    TagFetchOptionsAdapter getFetchOptions() {
        return new QbicTagFetchOptionsV1(this.openBisTag.getFetchOptions())
    }

    @Override
    List<MaterialAdapter> getMaterials() {
        return this.openBisTag.collect{ new QbicMaterialV1(it) }
    }

    @Override
    PersonAdapter getOwner() {
        return new QbicPersonV1(this.openBisTag.getOwner())
    }

    @Override
    TagPermIdAdapter getPermId() {
        return new QbicTagPermIdV1( this.openBisTag.getPermId())
    }

    @Override
    Date getRegistrationDate() {
        return this.openBisTag.getRegistrationDate()
    }

    @Override
    List<SampleAdapter> getSamples() {
        return this.openBisTag.getSamples().collect{ new QbicSampleV1(it)}
    }

    @Override
    boolean isPrivate() {
        return this.openBisTag.isPrivate()
    }
}
