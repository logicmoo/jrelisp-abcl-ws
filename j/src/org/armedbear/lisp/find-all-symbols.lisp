;;; find-all-symbols.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: find-all-symbols.lisp,v 1.1 2004-02-27 14:49:15 piso Exp $
;;;
;;; This program is free software; you can redistribute it and/or
;;; modify it under the terms of the GNU General Public License
;;; as published by the Free Software Foundation; either version 2
;;; of the License, or (at your option) any later version.
;;;
;;; This program is distributed in the hope that it will be useful,
;;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;;; GNU General Public License for more details.
;;;
;;; You should have received a copy of the GNU General Public License
;;; along with this program; if not, write to the Free Software
;;; Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

(in-package "SYSTEM")

(defun find-all-symbols (string)
  (let ((string (string string))
	(res ()))
    (dolist (package (list-all-packages))
      (multiple-value-bind (symbol status) (find-symbol string package)
        (when status
          (pushnew symbol res))))
    res))
