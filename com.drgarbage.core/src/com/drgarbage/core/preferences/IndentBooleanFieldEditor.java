/**
 * Copyright (c) 2008-2012, Dr. Garbage Community
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.drgarbage.core.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class IndentBooleanFieldEditor extends BooleanFieldEditor {
	
	
	public IndentBooleanFieldEditor() {
		super();
	}

	public IndentBooleanFieldEditor(String name, String label, Composite parent) {
		super(name, label, parent);
	}

	@Override
	protected void doFillIntoGrid(Composite parent, int numColumns) {
		super.doFillIntoGrid(parent, numColumns);
		
		Control chk = getChangeControl(parent);
		GridData gd = (GridData)chk.getLayoutData();
		gd.horizontalIndent = HORIZONTAL_GAP;

	}
	
}
