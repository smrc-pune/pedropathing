package org.firstinspires.ftc.teamcode.pedro;

import com.pedropathing.algorithm.Foresight;
import com.pedropathing.revhub.drivetrains.Mecanum;
import com.pedropathing.revhub.localizers.PinpointLocalizer;
import com.pedropathing.tuning.autotune.Procedure;
import com.pedropathing.tuning.autotune.Tuner;

import org.firstinspires.ftc.teamcode.pedro.procedures.ForesightTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.MecanumTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.PinpointTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.Tests;

/*
 * ============================================================================
 *  STAGED Tuning.java  -  version 2 (7 Oct 2026)
 *  Goes with the "Tuning Checklist" tab of "Pedro Pathing Constants Explained".
 *
 *  Needs: our normal Constants.java with these three fields (names exact):
 *    drivetrainConfig, localizerConfig, foresightConfig
 *  Constants.java is NOT staged. At each stage you paste the new AutoTune
 *  output over the matching block in Constants.java.
 *
 *  tests() has one version per stage. Exactly ONE return line is active.
 *  To move to the next stage: put // in front of the active return line and
 *  remove the // from the next stage's return line.
 * ============================================================================
 */
public class Tuning {

    // STAGE 1 - drivetrain tuner                                   [ON]
    @Tuner
    public static Procedure mecanumTuner() {
        return new MecanumTuner();
    }

    // STAGE 2 - Pinpoint tuner                                     [ON]
    // (Builds its own Pinpoint settings, so it does not use localizerConfig.)
    @Tuner
    public static Procedure pinpointTuner() {
        return new PinpointTuner();
    }

    // STAGE 3 - Foresight tuner                                    [OFF]
    // Off until Stage 2's gates pass, so nobody runs it on an unchecked
    // Pinpoint. It measures everything through localizerConfig.
    // To switch on in Stage 3: delete the START and END lines.
    /* ===== STAGE 3 START - delete this line in Stage 3 =====
    @Tuner
    public static Procedure foresightTuner() {
        return new ForesightTuner((hardwareMap) -> new PinpointLocalizer(hardwareMap, Constants.localizerConfig), (hardwareMap) -> new Mecanum(hardwareMap, Constants.drivetrainConfig));
    }
    ===== STAGE 3 END - delete this line ===== */

    // Tests - one return line per stage
    @Tuner
    public static Procedure tests() {
        // STAGE 1: drivetrain only -> Tests > Driving                  [ON]
        return new Tests(hardwareMap -> new Mecanum(hardwareMap, Constants.drivetrainConfig), null, null);

        // STAGE 2: drivetrain + Pinpoint -> Tests > Localization       [OFF]
        // Use after pasting the new PinpointConfig into Constants.java.
        // return new Tests(hardwareMap -> new Mecanum(hardwareMap, Constants.drivetrainConfig), (hardwareMap -> new PinpointLocalizer(hardwareMap, Constants.localizerConfig)), null);

        // STAGE 4: everything -> Hold, Line, Curved, Interpolation      [OFF]
        // Use after pasting the averaged ForesightConfig into Constants.java.
        // return new Tests(hardwareMap -> new Mecanum(hardwareMap, Constants.drivetrainConfig), (hardwareMap -> new PinpointLocalizer(hardwareMap, Constants.localizerConfig)), () -> new Foresight(Constants.foresightConfig));
    }
}
