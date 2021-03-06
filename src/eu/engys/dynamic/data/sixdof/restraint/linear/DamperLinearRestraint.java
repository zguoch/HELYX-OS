/*******************************************************************************
 *  |       o                                                                   |
 *  |    o     o       | HELYX-OS: The Open Source GUI for OpenFOAM             |
 *  |   o   O   o      | Copyright (C) 2012-2016 ENGYS                          |
 *  |    o     o       | http://www.engys.com                                   |
 *  |       o          |                                                        |
 *  |---------------------------------------------------------------------------|
 *  |   License                                                                 |
 *  |   This file is part of HELYX-OS.                                          |
 *  |                                                                           |
 *  |   HELYX-OS is free software; you can redistribute it and/or modify it     |
 *  |   under the terms of the GNU General Public License as published by the   |
 *  |   Free Software Foundation; either version 2 of the License, or (at your  |
 *  |   option) any later version.                                              |
 *  |                                                                           |
 *  |   HELYX-OS is distributed in the hope that it will be useful, but WITHOUT |
 *  |   ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or   |
 *  |   FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License   |
 *  |   for more details.                                                       |
 *  |                                                                           |
 *  |   You should have received a copy of the GNU General Public License       |
 *  |   along with HELYX-OS; if not, write to the Free Software Foundation,     |
 *  |   Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA            |
 *******************************************************************************/
package eu.engys.dynamic.data.sixdof.restraint.linear;

public class DamperLinearRestraint extends LinearRestraint {

    public static final String COEFF = "coeff";
    private double coeff = 0.0;

    public DamperLinearRestraint() {
    }

    public DamperLinearRestraint(double coeff) {
        this.coeff = coeff;
    }

    @Override
    public LinearRestraint copy() {
        return new DamperLinearRestraint(coeff);
    }

    @Override
    public LinearRestraintType getType() {
        return LinearRestraintType.DAMPER;
    }

    public double getCoeff() {
        return coeff;
    }

    public void setCoeff(double coeff) {
        firePropertyChange(COEFF, this.coeff, this.coeff = coeff);
    }

}
