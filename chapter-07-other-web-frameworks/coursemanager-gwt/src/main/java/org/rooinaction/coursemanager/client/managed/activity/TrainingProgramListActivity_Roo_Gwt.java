// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;
import java.util.Set;
import org.rooinaction.coursemanager.client.managed.request.ApplicationRequestFactory;
import org.rooinaction.coursemanager.client.managed.ui.CourseSetEditor;
import org.rooinaction.coursemanager.client.scaffold.ScaffoldMobileApp;
import org.rooinaction.coursemanager.client.scaffold.activity.IsScaffoldMobileActivity;
import org.rooinaction.coursemanager.client.scaffold.place.AbstractProxyListActivity;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyListView;
import org.rooinaction.coursemanager.web.gwt.proxies.CourseProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.TrainingProgramProxy;

public abstract class TrainingProgramListActivity_Roo_Gwt extends AbstractProxyListActivity<TrainingProgramProxy> implements IsScaffoldMobileActivity {

    protected ApplicationRequestFactory requests;

    public TrainingProgramListActivity_Roo_Gwt(PlaceController placeController, ProxyListView<org.rooinaction.coursemanager.web.gwt.proxies.TrainingProgramProxy> view, Class<org.rooinaction.coursemanager.web.gwt.proxies.TrainingProgramProxy> proxyType) {
        super(placeController, view, proxyType);
    }

    protected void fireCountRequest(Receiver<java.lang.Long> callback) {
        requests.trainingProgramRequest().countTrainingPrograms().fire(callback);
    }
}
