# Pedro Pathing tuning kit (BioBuzz 2026–27)

Guides, a checklist, a staged `Tuning.java` and a value checker for tuning Pedro Pathing 3 (Foresight) with a goBILDA Pinpoint on our mecanum robot.

| File | What it is |
| --- | --- |
| [Pedro_Pathing_Constants_Explained.md](Pedro_Pathing_Constants_Explained.md) (+ [PDF](Pedro_Pathing_Constants_Explained.pdf)) | The guide. Explains every value in `Constants.java`, with sources. Version 2.3 |
| [Tuning_Checklist.md](Tuning_Checklist.md) (+ [PDF](Tuning_Checklist.pdf)) | Stage-by-stage checklist with a gate after each stage and a sign-off log |
| [tuning-checker/index.html](tuning-checker/index.html) | Pedro Tuning Checker: paste `Constants.java` from up to 3 tuner runs to sanity-check, compare and average them |
| [`TeamCode/.../pedro/Tuning.java`](../../TeamCode/src/main/java/org/firstinspires/ftc/teamcode/pedro/Tuning.java) | Staged `Tuning.java` (version 2). Goes with the checklist |
| `images/` | The two diagrams used in the guide |

## Using the checker

- Open `tuning-checker/index.html` in any browser. It is one self-contained file: no install, no server, no build step.
- It works offline. Without internet it uses the system fonts instead of the web fonts; nothing else changes.
- Pasted runs are remembered only in that browser (local storage). Nothing is uploaded anywhere.
- To host it for the whole team: turn on GitHub Pages for this repository and open `docs/pedro-tuning/tuning-checker/`. (GitHub Pages is optional.)

## Where the files go

- `Tuning.java` replaces `TeamCode/src/main/java/org/firstinspires/ftc/teamcode/pedro/Tuning.java`. Back up the old one first (see Stage 0 of the checklist).
- `Constants.java` is **not** part of this kit. It stays our normal file; the checklist says which block to paste AutoTune output over at each stage.

## Keeping these in sync

The guide and checklist were written in a shared doc and exported here. If you edit the doc, export the Markdown and PDF again and commit them together, so the two formats match. Each file carries its own version number and date.

## Sources

Every claim in the guide points to a source: the Pedro Pathing paper (Sripada & Henderson), the [Pedro Pathing docs](https://pedropathing.com/docs/pathing/tuning), the [Pedro Quickstart tuner code](https://github.com/Pedro-Pathing/Quickstart), and the [goBILDA Pinpoint user guide](https://www.gobilda.com/content/user_manuals/3110-0002-0001%20User%20Guide.pdf). Checks that use our own reasoning or thresholds are labelled "our check".
