package life.qbic.api.v1.qbicobject

import ch.ethz.sis.openbis.generic.asapi.v3.dto.space.Space
import life.qbic.api.v1.openbis.adapter.*

protected class QbicSpaceV1 implements SpaceAdapter{

    private final Space openbisSpace

    QbicSpaceV1(openbisSpace) {
        this.openbisSpace = openbisSpace
    }

    @Override
    String getCode() {
        return this.openbisSpace.getCode()
    }

    @Override
    String getDescription(){
        return this.openbisSpace.getDescription()
    }

    @Override
    SpaceFetchOptionsAdapter getFetchOptions(){
        return new QbicSpaceFetchOptionsV1(this.openbisSpace.fetchOptions)
    }

    @Override
    Date getModificationDate(){
        return this.openbisSpace.getModificationDate()
    }

    @Override
    SpacePermIdAdapter getPermId(){
        return new QbicSpacePermIdV1(this.openbisSpace.getPermId())
    }

    @Override
    List<ProjectAdapter> getProjects(){
        return openbisSpace.getProjects().collect{ new QbicProjectV1(it)}
    }

    @Override
    Date getRegistrationDate(){
        return this.openbisSpace.getRegistrationDate()
    }

    @Override
    PersonAdapter getRegistrator(){
        return new QbicPersonV1(this.openbisSpace.getRegistrator())
    }

    List<SampleAdapter> getSamples(){
        return this.openbisSpace.getSamples().collect{ new QbicSampleV1(it)}
    }

}
