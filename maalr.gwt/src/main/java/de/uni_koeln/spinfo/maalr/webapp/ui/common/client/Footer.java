/*******************************************************************************
 * Copyright 2013 Sprachliche Informationsverarbeitung, University of Cologne
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.uni_koeln.spinfo.maalr.webapp.ui.common.client;

import com.github.gwtbootstrap.client.ui.Nav;
import com.github.gwtbootstrap.client.ui.NavLink;
import com.github.gwtbootstrap.client.ui.Navbar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Footer extends Composite {

	private static NavigationUiBinder uiBinder = GWT
			.create(NavigationUiBinder.class);
	

	interface NavigationUiBinder extends UiBinder<Widget, Footer> {
	}
	

	@UiField
	Navbar navBar;
	
	private Nav nav;
	
	public Footer() {
		initWidget(uiBinder.createAndBindUi(this));
		setStylePrimaryName("navbar-fixed-bottom");
		nav = new Nav();
		navBar.getElement().getStyle().setMarginBottom(0, Unit.PX);
		navBar.add(nav);
	}
	
	public void addLink(String title, String href) {
		nav.add(new NavLink(title, href));
	}

}