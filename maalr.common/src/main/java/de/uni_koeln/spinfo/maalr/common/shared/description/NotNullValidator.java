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
package de.uni_koeln.spinfo.maalr.common.shared.description;

import java.io.Serializable;
import java.util.List;

public class NotNullValidator extends ValueValidator implements Serializable {

	private static final long serialVersionUID = -8606856892579663937L;

	@Override
	public String validate(String input) {
		if(input != null && input.trim().length() > 0) return null;
		return "This field must not be empty";
	}

	@Override
	public List<String> getAllowedValues() {
		return null;
	}


}
